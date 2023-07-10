from subprocess import run
from glob import glob

if __name__ == "__main__":
    files = glob("./*.cpp") + glob("./*.h")
    for file in files:
        run(["clang-format", "-i", file])
