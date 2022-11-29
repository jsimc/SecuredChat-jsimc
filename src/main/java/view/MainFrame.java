package view;

import com.vaadin.flow.router.Route;

@Route("")
public class MainFrame{

    private static class MainFrameInstanceHolder{
        private static MainFrame instance = new MainFrame();
    }

    private MainFrame() {}

    public static MainFrame getInstance() {
        return MainFrameInstanceHolder.instance;
    }
}
