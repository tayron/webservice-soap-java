package br.com.ibk.v1.pessoa.juridica;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:14.429-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://ibk.com.br/v1/pessoa/juridica", name = "CriarPessoaJuridicaPortType")
@XmlSeeAlso({ObjectFactory.class, br.com.ibk.v1.enumeration.ObjectFactory.class, br.com.ibk.v1.ebo.ObjectFactory.class, br.com.ibk.v1.fault.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CriarPessoaJuridicaPortType {

    @WebMethod
    @WebResult(name = "criarPessoaJuridicaDadosSocioOutput", targetNamespace = "http://ibk.com.br/v1/pessoa/juridica", partName = "output")
    public CriarPessoaJuridicaDadosSocioOutputType criarPessoaJuridicaDadosSocio(
        @WebParam(partName = "input", name = "criarPessoaJuridicaDadosSocioInput", targetNamespace = "http://ibk.com.br/v1/pessoa/juridica")
        CriarPessoaJuridicaDadosSocioInputType input
    ) throws CriarPessoaJuridicaFault;
}
