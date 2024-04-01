package br.edu.infnet.juliatallarico.model;


    public class Aluno {
        private String nomeCompleto;
        private int idade;
        private int ano;
        private String turma;
        private Endereco endereco;
        private String nomeResponsaveis;
        private String telefoneContato;
        private double[] notas;

        // Construtor
        public Aluno(String nomeCompleto, int idade, int ano, String turma, Endereco endereco, String nomeResponsaveis, String telefoneContato, double[] notas) {
            this.nomeCompleto = nomeCompleto;
            this.idade = idade;
            this.ano = ano;
            this.turma = turma;
            this.endereco = endereco;
            this.nomeResponsaveis = nomeResponsaveis;
            this.telefoneContato = telefoneContato;
            this.notas = notas;
        }

        // Getters e Setters
        public String getNomeCompleto() {
            return nomeCompleto;
        }

        public void setNomeCompleto(String nomeCompleto) {
            this.nomeCompleto = nomeCompleto;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public String getTurma() {
            return turma;
        }

        public void setTurma(String turma) {
            this.turma = turma;
        }

        public Endereco getEndereco() {
            return endereco;
        }

        public void setEndereco(Endereco endereco) {
            this.endereco = endereco;
        }

        public String getNomeResponsaveis() {
            return nomeResponsaveis;
        }

        public void setNomeResponsaveis(String nomeResponsaveis) {
            this.nomeResponsaveis = nomeResponsaveis;
        }

        public String getTelefoneContato() {
            return telefoneContato;
        }

        public void setTelefoneContato(String telefoneContato) {
            this.telefoneContato = telefoneContato;
        }

        public double[] getNotas() {
            return notas;
        }

        public void setNotas(double[] notas) {
            this.notas = notas;
        }
    }

