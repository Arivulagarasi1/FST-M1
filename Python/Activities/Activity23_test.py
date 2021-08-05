import pytest
def test_sum(list1):
    sum = 0
    for n in list1:
        sum += n
    assert sum == 55