import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad extends JFrame implements ActionListener {
    // declaracion de objetos del menu
    JMenuBar menuBar;
    JMenu archivo,edicion,ver; //archivo, edicion, formato, ver, ayuda
    JMenuItem cortar,copiar,pegar,selecionarTodo;

    JTextArea textarea;
    JScrollPane scrollableTextArea;

    Notepad() {
        //set BorderLayout to frame
        this.getContentPane().setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //        region Menu

        // inicializar los objetos de JMenuItem
        cortar = new JMenuItem("cortar");
        copiar = new JMenuItem("copiar");
        pegar = new JMenuItem("pegar");
        selecionarTodo = new JMenuItem("Seleccionar Todo");

        // Inicializar los objetos de JMenuItem y JMenuBar
        menuBar = new JMenuBar();
        archivo=new JMenu("archivo");
        edicion=new JMenu("edicion");
        ver=new JMenu("ver");

        //Add ActionListner to the menu items or (buttons)
        cortar.addActionListener(this);
        copiar.addActionListener(this);
        pegar.addActionListener(this);
        selecionarTodo.addActionListener(this);


        //region add components
        // region JMenuItems -> JMenu
        //parte archivo


        //parte edicion
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        edicion.add(selecionarTodo);

        //parte ver


        // endregion
        // JMenu -> JMenuBar
        menuBar.add(archivo);
        menuBar.add(edicion);
        menuBar.add(ver);
        //endregion

        //set the menuBar as the JMenuBar of the frame
        this.setJMenuBar(menuBar);

        //endregion

        //        region TextArea
        //creating te textArea
        textarea = new JTextArea(20, 60);
        //creating the scroll pane and make it to textArea
        scrollableTextArea = new JScrollPane(textarea);
        //show the Horizontal and vertical bar always visible
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //add the scrollBar to the frame
        this.getContentPane().add(scrollableTextArea);
        //        endregion

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cortar)
            textarea.cut();
        if(e.getSource()==pegar)
            textarea.paste();
        if(e.getSource()==copiar)
            textarea.copy();
        if(e.getSource()==selecionarTodo)
            textarea.selectAll();
    }


}

