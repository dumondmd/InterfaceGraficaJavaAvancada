
package principal;

import java.util.ArrayList;

/**
 *
 * @author dumon
 */
public class Departamento {
    private int codigo;
    private String nome;
    ArrayList<Funcionario> Listafunc;
    
    public Departamento(){
        Listafunc = new ArrayList();
    }

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        Listafunc = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getListafunc() {
        return Listafunc;
    }

    public void setListafunc(ArrayList<Funcionario> Listafunc) {
        this.Listafunc = Listafunc;
    }
    public void addFunc(Funcionario F){
        F.setDep(this);
        Listafunc.add(F);
    }
}
