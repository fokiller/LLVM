; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @square(i32 %n) {
%t0 = mul i32 %n, %n
ret i32 %t0

}

define i32 @cube(i32 %n) {
%t1 = call i32 @square(i32 %n)
%t2 = mul i32 %n, %t1
ret i32 %t2

}

define i32 @main() {
%t3 = add i32 0, 3
%t4 = call i32 @cube(i32 %t3)
%t5 = add i32 0, %t4
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t5)

ret i32 0
}