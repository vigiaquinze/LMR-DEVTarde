package RevisaoFPOO2.Agenda;

public class AgendaConsulta {
        String nomeCompleto;
        String cpf;
        Object horarioEscolhido;
        public String getNomeCompleto() {
            return nomeCompleto;
        }
        public void setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
        }
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public Object getHorarioEscolhido() {
            return horarioEscolhido;
        }
        public void setHorarioEscolhido(Object horarioEscolhido) {
            this.horarioEscolhido = horarioEscolhido;
        }
        public AgendaConsulta() {
        }
        
}
