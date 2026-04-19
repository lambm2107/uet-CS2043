1. Biên dịch chương trình (javac): Không có lỗi xảy ra
2. Chạy chương trình (java): Xuất hiện lỗi
```
Exception in thread "main" java.lang.ClassCastException: 
class Dog cannot be cast to class Cat (Dog and Cat are in unnamed module of loader 'app') 
at Animals.main(Animals.java:8)
```
3. Sửa lại: Thay vì dùng ép kiểu, ta dùng instanceof để kiểm tra việc a có thuộc kiểu dữ liệu Cat không:
```
Cat c = (Cat) a; 
c.makeSound();
```
được thay bằng
```
if (a instanceof Cat) {
   a.makeSound();
} else {
   System.out.println("Đây không phải là Mèo!");
}
```