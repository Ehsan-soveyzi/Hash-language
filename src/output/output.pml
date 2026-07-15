/* Generated Promela model from Hash */

bool divByZero = false;
bool outOfBound = false;
bool nullPointer = false;
bool noPermission = false;
bool endReached = false;
int a;

active proctype main() {

    endReached = true;
    endReached_label:
    skip;
}
