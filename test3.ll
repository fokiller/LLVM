; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @main() {
%t0 = add i32 0, 0
%i = %t0

br label %while_cond_0
while_cond_0:
%t1 = add i32 0, 5
%t2 = icmp slt i32 %i, %t1
br i1 %t2, label %while_body_1, label %while_end_2
while_body_1:
%t3 = add i32 0, %i
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t3)
%t4 = add i32 0, 1
%t5 = add i32 %i, %t4
%i = %t5

br label %while_cond_0
while_end_2:

ret i32 0
}