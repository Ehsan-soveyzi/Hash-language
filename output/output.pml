/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int x;
int y;
int z;

active proctype main() {
    x = 10;
    y = 0;
    loop_start_1:
    do
    :: (x>0) ->
        inLoop_1:
        x = x-1;
        ;

    :: else -> break
    od;
    exitLoop_1:
    skip;
    if
    :: (y == 0) ->
       divByZero = true;
       goto endReached_label;
    :: else ->
       skip;
    fi;
    z = x/y;

    endReached = true;
    endReached_label:
    skip;
}


/*
------------------------
 ltl checker methods 
------------------------
*/

ltl safety {
    [] (!divByZero)
}

ltl liveness_1 {
    [](main@inLoop_1 -> <>main@exitLoop_1)
}

ltl reachability {
    <>endReached
}

