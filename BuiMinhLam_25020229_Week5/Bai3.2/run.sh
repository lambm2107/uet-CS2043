ROOT_DIR=$(pwd)      
SRC_DIR="$ROOT_DIR/src"
BUILD_DIR="$ROOT_DIR/build"  
mkdir -p "$BUILD_DIR"
javac -d "$BUILD_DIR" "$SRC_DIR"/*.java 
java -cp "$BUILD_DIR" TestDataInputStream
java -cp "$BUILD_DIR" TestDataOutputStream

read -p "Nhấn phím bất kỳ để tiếp tục..."