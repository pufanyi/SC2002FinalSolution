#include <string>

#include "Student.h"

Student::Student(const std::string &name) : name(name) {}

const std::string &Student::getName() const { return name; }
