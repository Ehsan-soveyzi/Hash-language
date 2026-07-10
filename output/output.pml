/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int x;

active proctype main() {
    x = 2;
    loop_start_1:
    do
    :: (x>=0) ->
        inLoop_1:
        x = x-1;
        ;

    :: else -> break
    od;
    exitLoop_1:
    skip;

    endReached = true;
    endReached_label:
    skip;
}
