package JavaCore2.Lesson02.HomeWork;

    public class MyArray {
        public static int transformToIntAndSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
            if (array.length != 4) {
                throw new MyArraySizeException(String.format("Длина массива не равна 4"));
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException(String.format("Размерность массива должна быть 4 x 4"));
                }

            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("Не число: " + i  + "," + j);
                    }
                }
            }
            return sum;
        }


        public static void main (String[]args){
            String[][] goodArray = {
                    {"0", "12", "2", "44",},
                    {"1", "15", "88", "12",},
                    {"5", "12", "9", "10",},
                    {"8", "17", "5", "24",},
            };

            try {
                System.out.println("Сумма элементов массива: " + transformToIntAndSum(goodArray));
            }
            catch (MyArraySizeException e) {
                System.out.println("Exception is catched: " + e);
            }
            catch (MyArrayDataException e) {
                System.out.println("Exception is catched: " + e);
            }
        }

    }
