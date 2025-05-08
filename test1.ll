; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @main() {
%t0 = add i32 0, 10
%a = %t0

%t1 = add i32 0, 20
%b = %t1

%t2 = add i32 0, 2
%t3 = mul i32 %b, %t2
%t4 = add i32 %a, %t3
%c = %t4

%t5 = add i32 0, %c
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t5)

ret i32 0
}