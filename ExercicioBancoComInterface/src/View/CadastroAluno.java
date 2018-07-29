package View;

import Interfaces.BaseInterface;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Guilherme Bialas
 */
public class CadastroAluno implements BaseInterface {

    private JFrame jFrame;
    private JButton jButtonSalvar, jButtonExcluir, jButtonListar, jButtonAlterar;
    private TextField jTextFieldNome, jTextFieldNota1, jTextFieldNota2, jTextFieldNota3, jTextFieldFrequencia, jTextFieldCodigoMatricula;
    private JLabel jLabelNome, jLabelNota1, jLabelNota2, jLabel3, jLabelFrequencia, jLabelCodigoMatricula;

    public CadastroAluno() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);

    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(700, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jButtonListar);
        jFrame.add(jButtonAlterar);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldNota1);
        jFrame.add(jTextFieldNota2);
        jFrame.add(jTextFieldNota3);
        jFrame.add(jTextFieldFrequencia);
        jFrame.add(jTextFieldCodigoMatricula);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelNota1);
        jFrame.add(jLabelNota2);
        jFrame.add(jLabel3);
        jFrame.add(jLabelFrequencia);
        jFrame.add(jLabelCodigoMatricula);
    }

    @Override
    public void gerarLocalizacoes() {

    }

    @Override
    public void gerarDimensoes() {

    }

    @Override
    public void instanciarComponentes() {

    }

}
