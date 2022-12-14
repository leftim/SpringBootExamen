package com.example.abouelhijafatma.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogginAspects {

    @AfterReturning("execution(void com.example.abouelhijafatma.Controllers.ExamenRestController.get*(..))")
    public void logMethodExit(JoinPoint joinPoint) {

        String name = joinPoint.getSignature().getName();

        log.info("Fin execution:" + name );
    }
    // display message before execution of every method in "Controllers"
    // Check console in intelliJ for result
    //premier etoile sert a definir le type de retour
    /*
    @Before("execution(* com.example.abouelhijafatma.Controllers.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {

        String name = joinPoint.getSignature().getName();

        log.info("Début Exécution : " + name );
    }

    /*

    fetchtype.Eager in @oneToMany (brings all functions related to a table ex: stock.getProduit()

    fetchtype.Lazy l3aks
    onetoone automatiquement fetchtype.eager

    # display message before execution of every method with name that starts with "ajouter" in "controllers"
    @Before("execution(* tn.esprit.controllers.*.ajouter*(..))")

    # display message after execution of every method of "services"
	@After("execution(* tn.esprit.services.*.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {

		String name = joinPoint.getSignature().getName();

		log.info("Out of method :" + name );
	}

    */
}
