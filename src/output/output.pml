/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int kir;

active proctype main() {
    kir = 12;
    loop_start_1:
    do
    :: (kir>0) ->
        inLoop_1:
        kir = kir-1;
        ;

    :: else -> break
    od;
    exitLoop_1:
    skip;

    endReached = true;
    endReached_label:
    skip;
}
