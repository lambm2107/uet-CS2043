### 1. Hàm main
####    Khi chúng ta chạy, kết quả xuất ra như sau:
```     
1. Person is created
2. Employee is created
3. Manager is created
```
### 2. Nâng cao
####    - Sau khi xoá constructor đi, chương trình chạy bị lỗi
`java: constructor Person in class Person cannot be applied to given types;`
####    - Sửa lỗi: 
Chúng ta phải thêm hàm `super("một_chuỗi_bất_kỳ")` vào constructor Employee
####    - Lý do:
- Constructor của Person đã có thêm tham số
- Khi chúng ta tạo constructor cho Employee, Java sẽ tự động ngầm thêm hàm super() vào
- **Kết quả:**  Vì hàm super() đó không có tham số, dẫn đến xung đột với constructor hiện tại của Person, từ đó gây ra lỗi biên dịch
