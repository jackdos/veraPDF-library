package org.verapdf.model.impl.pb.operator.generalgs;

import java.util.List;

import org.apache.pdfbox.cos.COSBase;
import org.verapdf.model.coslayer.CosReal;
import org.verapdf.model.operator.Op_M_miter_limit;

/**
 * @author Timur Kamalov
 */
public class PBOp_M_miter_limit extends PBOpGeneralGS implements
        Op_M_miter_limit {

    public static final String OP_M_MITER_LIMIT_TYPE = "Op_M_miter_limit";
    public static final String MITER_LIMIT = "miterLimit";

    public PBOp_M_miter_limit(List<COSBase> arguments) {
        super(arguments, OP_M_MITER_LIMIT_TYPE);
    }

    @Override
    public List<? extends org.verapdf.model.baselayer.Object> getLinkedObjects(
            String link) {
        if (MITER_LIMIT.equals(link)) {
            return this.getMiterLimit();
        }
        return super.getLinkedObjects(link);
    }

    private List<CosReal> getMiterLimit() {
        return this.getLastReal();
    }

}
