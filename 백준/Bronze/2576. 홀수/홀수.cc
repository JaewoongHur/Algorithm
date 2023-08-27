#include <iostream>
#include <climits> 
using namespace std;



int main() {

	int sum = 0;
	int min = INT_MAX;
	int arr[7];	
	for (int i = 0; i < 7; i++) {
		cin >> arr[i];
		if (arr[i] % 2 == 1) {
			sum += arr[i];
			if (min > arr[i]) {
				min = arr[i];
			}
		}
	}
	if (min == INT_MAX) {
		cout << -1;
	}
	else {
		cout << sum << endl;
		cout << min;
	}
	return 0;
}