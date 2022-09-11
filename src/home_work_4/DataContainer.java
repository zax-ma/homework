package home_work_4;

import home_work_4.comparators.ComparatorComparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class DataContainer<T> {
        private T[] data;

        public DataContainer(T[] data) {
            this.data = data;
        }

        public T[] getItems(){
            return Arrays.copyOf(this.data, this.data.length); //безопасная передача массива, чтобы в изначальный массив data не могли внести сторонние изменения

        }

        public int add(T item){ //запись в первую пустую позицию данных и возврат индекса, в который что-то передали
            if(item == null){
                return -1;
            }

            int indexForInsert = -1; //индекс, в который собираемся вставить данные. Поиск null

            for (int i = 0; i < this.data.length; i++) {
                if(this.data[i] == null){
                    indexForInsert = i; // сохраняет в переменную индекс первой пустой позиции в массиве и переходит к добавлению this.data[indexForInsert] = item;
                    break;
                }
            }
            if(indexForInsert == -1) { //если не нашел пурвую пустую позицию, то переходит к расширению массива
                indexForInsert = this.data.length;
                this.data = Arrays.copyOf(this.data, this.data.length + 1);
            }
                this.data[indexForInsert] = item;
                return indexForInsert;
            }
/*
вывод значения заданного индекса + проверка существования индекса
 */
    public T get(int index){
        if(!checkIndexExist(index)){ // индекс не существует
            return null;
        }
        return this.data[index];
    }

    public boolean delete(int index){ //удаление значения и смещение на его позицию следующего за ним значения
        if(!checkIndexExist(index)){
            return false;
        }

        for (int i = index + 1; i < this.data.length; i++) { //следующее за удаляемым значение, и если можно перейти на index+1, то можно делать перестановку
            this.data[i - 1] = this.data[i];
        }
        // this.data[this.data.length-1] = null; //запись null на место последнего значения, чтобы оно не задвоилось при перестановке
        //лучше использовать предыдущую запись, чтобы при добавлении не создавать новый массив, тк в данном случае будет выполнен только if(this.data[i] == null)
        this.data = Arrays.copyOf(this.data, this.data.length - 1); //сокращение размера массива через создание нового, при добавлении нового элемента будет вызван if(indexForInsert == -1)
        return true;
    }

    private boolean checkIndexExist(int index){ //возвращает true, если индекс существует в пределах массива. Выделяется в метод, так как это не единственная проверка
        return index >= 0 && index < this.data.length;
    }

    public boolean delete(T item){ //удаление переданного значения из массива
        if(item == null){
            return false;
        }

        for (int i = 0; i < this.data.length; i++) {
            if(Objects.equals(data[i], item)){ //сравнение данных
                return delete(i); //использование метода delete(int index), вернет true
            }
        }
        return false; //иначе вернет false
    }

    public void sort(Comparator<T> cmp){
       DataContainer.sort(this, cmp);
    }

    public static void sort(DataContainer<?extends Comparable> container){
        DataContainer.sort(container, new ComparatorComparable());

    }

    public static<T> void sort(DataContainer<T> container, Comparator<? super T> cmp){ //нельзя сочетать extend и extend, можно только super и extend
        boolean sorted;
        do {
            sorted = true;
            for (int j = 0; j < container.data.length - 1; j++) {
                if (cmp.compare(container.data[j], container.data[j+1])>0) {
                    sorted = false;
                    T tmp = container.data[j + 1];
                    container.data[j + 1] = container.data[j];
                    container.data[j] = tmp;
                }
            }
        }while (!sorted);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        boolean needComma = false; //изменит значение, если будет вставлен хотя бы один элемент
        for (T datum : this.data) {
            if (datum != null) {
                //  builder.append(String.valueOf(this.data[i]));
                if (needComma) {
                    builder.append(", ");
                } else {
                    needComma = true;
                }
                builder.append(datum); //без использования String.valueOf, тк метод StringBuilde его уже содержит
            }
        }

        builder.append("]");
        return builder.toString();
    }
}


