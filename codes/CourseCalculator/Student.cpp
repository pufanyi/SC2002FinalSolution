/**
 * @file Student.cpp
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#include "Student.h"

#include <string>

Student::Student(const std::string &name) : name(name) {}

const std::string &Student::getName() const { return name; }
