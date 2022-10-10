import unittest
from app import parse_marks_from_input,calculate_total

class TestTotal(unittest.TestCase):
    
    def test_parse_marks_from_input(self):
        input_text ="a,10,b,c,20,d,30,e,40"
        expectedMarks = ["10","20","30","40"]
        actualMarks = parse_marks_from_input(input_text)
        self.assertEqual(expectedMarks, actualMarks)
    
    def test_calculate_total(self):
        marks = [10,20,30,40]
        expectedTotal = 100
        actualTotal = calculate_total(marks)
        self.assertEqual(expectedTotal, actualTotal)

if __name__ == '__main__':
    unittest.main()
