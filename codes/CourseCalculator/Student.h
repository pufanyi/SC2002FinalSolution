/**
 * @file Student.h
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#ifndef CODES_COURSECALCULATOR_STUDENT_H_
#define CODES_COURSECALCULATOR_STUDENT_H_

#include <string>

class Student {
 private:
  std::string name;

 public:
  Student(const std::string &name);

  const std::string &getName() const;

  virtual double calOverall() const = 0;
};

#endif  // CODES_COURSECALCULATOR_STUDENT_H_
