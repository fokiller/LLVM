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
; print %c (dummy print instruction)
%c
ret i32 0
}