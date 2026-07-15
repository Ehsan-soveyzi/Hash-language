/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int x;
int y;
int z;
int p;
int t;

active proctype main() {
    x = 20;
    y = 2;
    z = 0;
    p = 0;
    /* emtehan block */
    loop_start_1:
    do
    :: (x>0) ->
        inLoop_1:
        t = 5;
        loop_start_2:
        do
        :: (true) ->
            inLoop_2:
            if
            :: (t>3) ->
                goto loop_start_2;

            :: else ->
                break;

            fi;

        :: else -> break
        od;
        exitLoop_2:
        skip;
        if
        :: (y == 0) ->
           divByZero = true;
           goto end_try_1;
        :: else ->
           skip;
        fi;
        z = x/y;
        ;
        if
        :: (p>50) ->
            skip;

        :: else ->
            skip;

        fi;
        x = x - (5);
        ;
        y = y - (1);
        ;

    :: else -> break
    od;
    exitLoop_1:
    skip;
    end_try_1:
    if
    :: (divByZero) ->
        divByZero = false;
        skip;

    :: else -> skip
    fi;
    /* akhar block */
    skip;

    endReached = true;
    endReached_label:
    skip;
}
