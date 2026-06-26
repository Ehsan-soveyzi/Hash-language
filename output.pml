/* Generated Promela model from Hash */

bool divByZero = false;
bool endReached = false;
int x;
bool err_1 = false;

active proctype main() {
    x = 2;
    err_1 = false;
    /* emtehan block */
    divByZero = true;
    if
    :: (err_1) ->
        skip;

    :: else -> skip
    fi;
    /* akhar block */
    skip;

    endReached = true;
    endReached_label:
    skip;
}
