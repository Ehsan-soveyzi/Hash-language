/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;

active proctype main() {
    pow_result_1 = 1;
    pow_counter_1 = 0;
    do
    :: (pow_counter_1 < 2) ->
       pow_result_1 = pow_result_1 * 2;
       pow_counter_1 = pow_counter_1 + 1;
    :: else -> break
    od;
    if
    :: (pow_result_1<5) ->
        skip;

    :: else ->
        skip;

    fi;

    endReached = true;
    endReached_label:
    skip;
}
