/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int a;
int x;

active proctype main() {
    a = 5;
    x = 2;
    loop_start_1:
    do
    :: (a>=0) ->
        inLoop_1:
        a = a-1;
        ;
        loop_start_2:
        do
        :: (true) ->
            inLoop_2:
            skip;

        :: else -> break
        od;
        exitLoop_2:
        skip;

    :: else -> break
    od;
    exitLoop_1:
    skip;

    endReached = true;
    endReached_label:
    skip;
}
