module algorithms.binarysearch;

import std.stdio;

void main() {
    int[] array = [1, 12, 37, 48, 72, 95, 117, 146, 213, 1048];
    auto binarySearch = new BinarySearch;


    bool present = binarySearch.search(array, 0, cast(int) array.length - 1, 72);
    writefln("72 is present should be true is: %s", present);
    present = binarySearch.search(array, 0, cast(int) array.length - 1, 44);
    writefln("44 is present should be false is: %s", present);
}

class BinarySearch {

    bool search(int[] array, int x, int y, int target) {
        if (x > y) {
            return false;
        }

        int mid = (x+y)/2;

        if (array[mid] == target) {
            return true;
        } else if (array[mid] > target) {
            return search(array, x, mid-1, target);
        } else {
            return search(array, mid+1, y, target);
        }
    }
}
