interface IData {
    void show();
}

class DataManager implements IData {
    public void show(){
        System.out.println("Print data");
    }
    /*
          Error:
                java: show() in DataManager cannot implement show() in IData
                attempting to assign weaker access privileges; was public
          Solution:
                Adding 'public'
    */
}


