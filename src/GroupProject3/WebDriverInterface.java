package GroupProjects.GroupProject3;

public interface WebDriverInterface {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenShot();
}

interface RemoteWebDriverInterface extends WebDriverInterface, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriverInterface {

    public void open() {
        System.out.println("Open Google Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Google Chrome Browser");
    }

    @Override
    public String getTitle() {

        String getTitle = "Google";

        return getTitle;
    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenshot of current webpage on Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Chrome to new webpage");
    }
}

class FireFoxDriver implements RemoteWebDriverInterface {
    public void open() {
        System.out.println("Open Mozilla FireFox Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Mozilla FireFox Browser");
    }

    @Override
    public String getTitle() {
        String getTitle = "Firefox";
        return getTitle
                ;
    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenshot of current webpage on Mozilla FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Mozilla FireFox to new webpage");
    }
}

class SafariDriver implements RemoteWebDriverInterface {
    public void open() {
        System.out.println("Open Safari Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari Browser");
    }

    @Override
    public String getTitle() {

        String getTitle = "Safari";

        return getTitle;
    }

    @Override
    public void getScreenShot() {
        System.out.println("Take screenshot of current webpage on Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate Safari to new webpage");
    }
}

class test {
    public static void main(String[] args) {
        RemoteWebDriverInterface ChromeDriver;
        RemoteWebDriverInterface SafariDriver;
        RemoteWebDriverInterface FireFoxDriver;

        RemoteWebDriverInterface[] array = {new ChromeDriver(), new SafariDriver(), new FireFoxDriver()};
        for (RemoteWebDriverInterface arr : array) {
            arr.open();
            arr.close();
            System.out.println(arr.getTitle());
            arr.getScreenShot();
            arr.navigate();
        }


    }
}

