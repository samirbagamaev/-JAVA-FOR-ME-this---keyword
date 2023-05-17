//КЛЮЧЕВОЕ СЛОВО this

//this = этот,это, оно указывает на объект

package WORK;

class Human {

    String name; // ИМЯ ЧЕЛОВЕКА
    int age; // ВОЗРАСТ ЧЕЛОВЕКА



    // БЕЗ this
    // public void setName(String theName) { //имя переменной может быть разным
    // name = theName;
    // }

    // public void setAge(int myAge) {
    // age = myAge;
    // }


    
    /*
     * В МЕТОДЕ ОБЫЧНО(почти всегда) ТАК И ИСПОЛЬЗУЕТСЯ this
     * this НУЖЕН, ЧТОБЫ НЕ ИСПОЛЬЗОВАТЬ 2 ИЛИ НЕСКОЛЬКО РАЗЛИЧНЫХ ИМЕН В МЕТОДЕ set
     * -
     * А ИСПОЛЬЗОВАТЬ ТОЛЬКО ОДНО ИМЯ!!!!!
     */

    // С ИСПОЛЬЗОВАНИЕМ this P.S ОТВЕТ НЕ ИЗМЕНИТЬСЯ
    public void setName(String name) { // имя переменной может быть разным
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println(name + "," + age);
    }

}
