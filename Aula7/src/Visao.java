import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visao extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JTextArea txtTexto = new JTextArea();
    private JScrollPane jspTexto = new JScrollPane(txtTexto);
    private JTextField txtResumo = new JTextField();
    private JButton btnCalcular = new JButton("Calcular SHA-256");


    //Metodo principal de execução
    public static void main(String[] args) {
        new Visao().setVisible(true);
    }
    //Metodo Construtor da Classe
    public Visao() {
        //Configurações da Janela,Titulo, Tamanho, Layout
        setTitle("Calculo do Resumo Unidirecional SHA-256");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        //Configurações do Componente txtTexto
        jspTexto.setBounds(10, 10, 465, 280);
        add(jspTexto);
        txtTexto.setLineWrap(true);

        //Configurações do Componente txtResumo
        txtResumo.setBounds(10, 300, 465, 25);
        add(txtResumo);
        txtResumo.setEditable(false);

        //Configurações do Componente btnCalcular
        btnCalcular.setBounds(10, 330, 465, 25);
        add(btnCalcular);
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    txtResumo.setText(SHA256.calcular(txtTexto.getText()));
                }catch (Exception erro) {
                    JOptionPane.showMessageDialog(null,erro);
                }
            }
        });

    }
}
