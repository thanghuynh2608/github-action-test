package com.netflopbackend.cdkjava;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.BucketEncryption;
import software.amazon.awscdk.services.s3.BucketProps;
import software.constructs.Construct;

public class NetflopBeStack extends Stack {

    public NetflopBeStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public NetflopBeStack(final Construct scope, String id, final StackProps props) {
        super(scope, id, props);

        // TO-DO
        // Add AWS Resource Here

        // Create S3 to store jar package
        Bucket bucket = new Bucket(this, "Test-CDK-10182023", new BucketProps.Builder()
                .versioned(true)
                .encryption(BucketEncryption.KMS_MANAGED)
                .build());
    }
}
