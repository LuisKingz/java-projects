package examen;

public class Pedido implements CalcularCuentas{
    private String codigoPedido;
    private String tipoCafe;
    private String tipoHuevo;
    private int precioCafe;
    private int precioHuevo;
    private int total;

    public Pedido(String nombreCliente, String tipoCafe, String tipoHuevo, int precioCafe, int precioHuevo, int total) {
        this.tipoCafe = tipoCafe;
        this.tipoHuevo = tipoHuevo;
        this.precioCafe = precioCafe;
        this.precioHuevo = precioHuevo;
        this.total = total;
    }
    
    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public String getTipoHuevo() {
        return tipoHuevo;
    }

    public void setTipoHuevo(String tipoHuevo) {
        this.tipoHuevo = tipoHuevo;
    }

    public int getPrecioCafe() {
        return precioCafe;
    }

    public void setPrecioCafe(int precioCafe) {
        this.precioCafe = precioCafe;
    }

    public int getPrecioHuevo() {
        return precioHuevo;
    }

    public void setPrecioHuevo(int precioHuevo) {
        this.precioHuevo = precioHuevo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void calcularTotal(int pCafe, int pHuevo) {
        int total;
        
        total = pCafe + pHuevo;
        
        this.total=total;
    }

    @Override
    public String generarPedidos(String nombreCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
