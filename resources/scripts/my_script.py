# resources/scripts/my_script.py
import sys

if __name__ == "__main__":
    arg1 = sys.argv[1] if len(sys.argv) > 1 else "default1"
    arg2 = sys.argv[2] if len(sys.argv) > 2 else "default2"

    print(f"Received arguments: {arg1}, {arg2}")
