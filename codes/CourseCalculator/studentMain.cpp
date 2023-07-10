#include <iomanip>
#include <iostream>

#include "Student.h"

void printOverall(const Student &student) {
  std::cout << student.getName() << "'s overall score is " << std::fixed
            << std::setprecision(2) // set precision to 2 decimal places
            << student.calOverall() << std::endl;
}

#include "Postgraduate.h"
#include "Undergraduate.h"

int main() {
  Postgraduate  postgraduate("John", 80, 90, 70);
  Undergraduate undergraduate("Mary", 80, 70);

  printOverall(postgraduate);
  printOverall(undergraduate);

  return 0;
}