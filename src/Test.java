public class Test {

    public static void main(String[] args) {
        String a = "I like Java!!!";

        boolean contains = a.contains("Java");
        System.out.println("Cодержит ли строка подстроку “Java” : " + contains);

        boolean startWith = a.startsWith("I like");
        System.out.println("Начинается ли строка с подстроки “I like” : " + startWith);

        boolean endWith = a.endsWith("!!!");
        System.out.println("Заканчивается ли строка с подставки “!!!” : " + endWith);

        if (contains && startWith && endWith) {
            System.out.println("Предыдущие условия верны: " + a.toUpperCase());
        } else {
            System.out.println("Условия не верны");
        }

        String replaceA = a.replace('a', 'o');
        int index = replaceA.indexOf("Jovo");
        if (index == -1) {
            System.out.println("Не содержит Jovo");
        } else {
            System.out.println("Подстрока " + replaceA.substring(index, index + "Jovo".length()));
        }
    }

}
