/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int b;
int c;
int a;

active proctype main() {
    /* emtehan block */
    if
    :: (c == 0) ->
       divByZero = true;
       goto end_try_1;
    :: else ->
       skip;
    fi;
    a = b/c;
    end_try_1:
    if
    :: (divByZero) ->
        divByZero = false;
        skip;

    :: else -> skip
    fi;
    /* akhar block */
    skip;
    if
    :: (c == 0) ->
       divByZero = true;
       goto end_Reached;
    :: else ->
       skip;
    fi;
    a = b/c;

    endReached = true;
    end_Reached:
    skip;
}
