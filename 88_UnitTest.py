import unittest

class UnitTest(unittest.TestCase):

    def __init__(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        self.nums1 = nums1
        self.m = m
        self.nums2 = nums2
        self.n = n

        

    def test_01(self, nums1:[1,2,3,0,0,0], m:3, nums2:[2,5,6], n:3):
        self.assertEqual(88)
    
    def test_02(self):
        pass

    def test_03(self):
        pass



if __name__ == '__main__':
    unittest.main()