class FooBar {
    private int n;
    boolean flag = true;
    public FooBar(int n) {
        this.n = n;
    }

    public synchronized void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!flag) {
                try{
                    wait();
                } catch(InterruptedException e){
                    
                }

            }
            System.out.print("foo");
            flag = false;
            notify();
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
        }
    }

    public synchronized void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
             while(flag) {
                try{
                    wait();
                } catch(InterruptedException e){
                    
                }

            }
            System.out.print("bar");
            flag = true;
            notify();
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
        }
    }
}
