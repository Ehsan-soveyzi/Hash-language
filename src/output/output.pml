/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int s;

active proctype main() {
    s = 12;
    loop_start_1:
    do
    :: (s>0) ->
        inLoop_1:
        s = s-1;
        ;

    :: else -> break
    od;
    exitLoop_1:
    skip;

    endReached = true;
    endReached_label:
    skip;
}
