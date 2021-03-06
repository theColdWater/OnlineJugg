{-
Filter a given array of integers and output only those values that are less than a specified value X.
The output integers should be in the same sequence as they were in the input.
-}

f :: Int -> [Int] -> [Int]
f n arr = filter (<n) arr

-- The Input/Output section. You do not need to change or modify this part
main = do
    n <- readLn :: IO Int
    inputdata <- getContent
    let
        numbers = map read (lines inputdata) :: [Int]
    putStrLn . unlines $ (map show . f n) numbers