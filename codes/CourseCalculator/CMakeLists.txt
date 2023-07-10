cmake_minimum_required(VERSION 3.25)
project(CourseCalculator)

set(CMAKE_CXX_STANDARD 17)

add_executable(CourseCalculator studentMain.cpp CourseComponent.cpp CourseComponent.h Postgraduate.cpp Postgraduate.h Student.cpp Student.h Undergraduate.cpp Undergraduate.h)
