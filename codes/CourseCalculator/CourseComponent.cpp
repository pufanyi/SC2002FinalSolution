/**
 * @file CourseComponent.cpp
 * @author Fanyi Pu (FPU001@e.ntu.edu.sg)
 * @version 0.1
 * @date 2023-07-10
 *
 * @copyright Copyright (c) 2023
 *
 */

#include "CourseComponent.h"

#include <string>

CourseComponent::CourseComponent(const std::string &componentName,
                                 const double percentage, const int score)
    : componentName(componentName), percentage(percentage), score(score) {}

double CourseComponent::getPercentage() const { return percentage; }

int CourseComponent::getScore() const { return score; }
