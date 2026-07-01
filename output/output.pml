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
    y = 2;
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

ltl reachability {
    <>endReached
}

ltl invariant {
   [](x >= 0)
}