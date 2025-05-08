; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @multiply(i32 %a, i32 %b) {
%t0 = mul i32 %a, %b
ret i32 %t0

}

define i32 @add(i32 %x, i32 %y) {
%t1 = add i32 %x, %y
ret i32 %t1

}

define i32 @main() {
%t2 = add i32 0, 2
%t3 = add i32 0, 3
%t4 = add i32 0, 4
%t5 = call i32 @multiply(i32 %t3, i32 %t4)
%t6 = call i32 @add(i32 %t2, i32 %t5)
%z = %t6

%t7 = add i32 0, %z
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t7)

ret i32 0
}