#ifndef STUDENT_H_
#define STUDENT_H_

#include <string>

class Student {
 private:
  std::string name;

 public:
  Student(const std::string &name);

  const std::string &getName() const;

  virtual double calOverall() const = 0;
};

#endif  // STUDENT_H_
