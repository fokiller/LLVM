; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @main() {
%t0 = add i32 0, 0
%sum = %t0

%t1 = add i32 0, 1
%t2 = add i32 0, 5
%i = %t1
br label %for_cond_0
for_cond_0:
%t3 = icmp sle i32 %i, %t2
br i1 %t3, label %for_body_1, label %for_end_2
for_body_1:
%t4 = add i32 %sum, %i
%sum = %t4

%t5 = add i32 %i, 1
br label %for_cond_0
for_end_2:

%t6 = add i32 0, %sum
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t6)

ret i32 0
}