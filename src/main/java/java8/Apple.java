package java8;

public class Apple {
    static int instance=0;
    Apple(){

        instance++;
    }


    public static void main(String[] args) {
        Apple a1= new Apple();
        Apple a2= new Apple();
        Apple a3= new Apple();
        //System.out.println("No of instances : "+ instance);

        int[] arr = {1,2,3,4,5,6,7,1};
        //1-4 3-4
        //list.stream().filter(e->e.getVal).count
        int res = findDecend(arr);
        System.out.println("Decend order at " + res);

    }

    private static int findDecend(int[] arr) {

        int l = 0;
        int h = arr.length -1;
        int mid=0;
        while(l < h){
            mid= (l+h)/2; //9-0/2=4

            if(arr[mid] > arr[mid-1] && arr[mid]  >arr[mid+1])
                return arr[mid];
            else if(arr[mid] > arr[mid-1])// 3000>1000 &&  3000 < 35000
                l = mid+1;
            else
                h= mid;

        }
        return -1;
    }

}
