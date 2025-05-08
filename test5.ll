; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @compute(i32 %a, i32 %b) {
%t0 = mul i32 %a, %b
%temp = %t0
%t1 = add i32 0, 10
%t2 = add i32 %temp, %t1
ret i32 %t2

}

define i32 @main() {
%t3 = add i32 0, 2
%t4 = add i32 0, 3
%t5 = call i32 @compute(i32 %t3, i32 %t4)
%result = %t5

%t6 = add i32 0, %result
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t6)

ret i32 0
}