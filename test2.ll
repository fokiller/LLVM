; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @add(i32 %x, i32 %y) {
%t0 = add i32 %x, %y
ret i32 %t0

}

define i32 @main() {
%t1 = add i32 0, 3
%t2 = add i32 0, 4
%t3 = call i32 @add(i32 %t1, i32 %t2)
%z = %t3

%t4 = add i32 0, %z
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t4)

ret i32 0
}